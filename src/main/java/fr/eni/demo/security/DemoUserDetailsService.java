package fr.eni.demo.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import fr.eni.demo.bo.Utilisateur;

@Component
public class DemoUserDetailsService implements UserDetailsService{

	//@Autowired
	//private UtilisateurRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		return null;
	}

}
