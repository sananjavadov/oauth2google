package az.smr.googleoauthexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.smr.googleoauthexample.entity.User;
import az.smr.googleoauthexample.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public User getByMail(String mail) {
		return userRepository.findByMail(mail);
	}
}
