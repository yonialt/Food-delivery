@Service
public class Authservice {

    private final UserRepository repository;
    private final JwtService jwtService;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public Authservice(UserRepository repository, JwtService jwtService) {
        this.repository = repository;
        this.jwtService = jwtService;
        th
    }

    public Authresponse login(Authrequest request) {

        User user = repository.findByName(request.getName())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!encoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Wrong password");
        }

        String token = jwtService.generateToken(user.getName());

        return new Authresponse(token);
    }
}