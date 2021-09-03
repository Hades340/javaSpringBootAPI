package learnSpringboot.config;

/*
 * @Configuration
 * 
 * @EnableJpaAuditing(auditorAwareRef = "auditorProvider") public class
 * jpaAuditingConfig {
 * 
 * @Bean public AuditorAware<String> auditorProvider(){ return new
 * AuditorAwareImpl(); }
 * 
 * public static class AuditorAwareImpl implements AuditorAware<String>{
 * 
 * @Override public Optional<String> getCurrentAuditor() { Authentication
 * authentication = SecurityContextHolder.getContext().getAuthentication();
 * if(authentication == null || !authentication.isAuthenticated()) { return
 * null; } return Optional.of(authentication.getName()); }
 * 
 * }
 * 
 * }
 */
