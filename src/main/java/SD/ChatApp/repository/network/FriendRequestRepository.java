package SD.ChatApp.repository.network;

import SD.ChatApp.model.network.FriendRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface FriendRequestRepository extends JpaRepository<FriendRequest, String> {

    Optional<FriendRequest> findBySenderIdAndReceiverId(String senderId, String receiverId);

    @Transactional
    void deleteBySenderIdAndReceiverId(String senderId, String receiverId);
}
