package SD.ChatApp.repository.network;

import SD.ChatApp.model.network.FriendRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface FriendRelationRepository extends JpaRepository<FriendRelation, String> {

    Optional<FriendRelation> findByUserIdAndFriendId(String id1, String id2);

//    @Query(value = "delete from FriendRelation where userId = :id1 and friendId = :id2")
    @Transactional
    void deleteByUserIdAndFriendId( String id1,  String id2);
}
