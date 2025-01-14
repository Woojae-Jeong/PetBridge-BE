package PetBridge.member.repository;

import PetBridge.member.model.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository <Member, Long>  {
    Optional<Member> findByEmail(String email);

    Boolean existsByEmail(String email);

    Optional<Member> findByEmailAndPassword(String email, String password);

    Boolean existsByNickname(String nickname);

}
