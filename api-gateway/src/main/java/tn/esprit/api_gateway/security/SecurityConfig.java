package tn.esprit.api_gateway.security;

/*@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
                .csrf(csrf -> csrf.disable()) // Disable CSRF
                .cors(cors -> cors.configurationSource(corsConfigurationSource())) // Enable CORS
                .authorizeExchange(exchanges -> exchanges
                        .pathMatchers(HttpMethod.OPTIONS, "/**").permitAll() // Allow all OPTIONS requests
                        .pathMatchers("/eureka/**").permitAll() // Allow access to Eureka endpoints
                        .pathMatchers("/logout").permitAll() // Allow access to the logout endpoint
                        .pathMatchers("/application/**").permitAll() // Allow access to application endpoints
                        .anyExchange().authenticated() // Require authentication for all other endpoints
                )
                .oauth2ResourceServer(oauth2 -> oauth2.jwt(jwt -> {})); // Enable OAuth2 resource server with JWT

        return http.build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration corsConfig = new CorsConfiguration();
        corsConfig.addAllowedOrigin("*"); // Allow all origins (or specify your Angular app's origin, e.g., "http://localhost:4200")
        corsConfig.addAllowedMethod("*"); // Allow all HTTP methods (GET, POST, OPTIONS, etc.)
        corsConfig.addAllowedHeader("*"); // Allow all headers
        corsConfig.setAllowCredentials(true); // Allow credentials (e.g., cookies)

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfig); // Apply this configuration to all paths

        return source;
    }
}*/
