package az.smr.googleoauthexample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import az.smr.googleoauthexample.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

	public User findByMail(String mail);
	
}
