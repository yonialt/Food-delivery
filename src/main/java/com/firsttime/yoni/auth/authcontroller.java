package com.firsttime.yoni.auth;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService service;

    public AuthController(AuthService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public Authresponse login(@RequestBody User user) {
        return service.login(user.getName(), user.getPassword());
    }
}
