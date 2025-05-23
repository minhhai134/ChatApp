package SD.ChatApp.dto.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetFriendRequestListResponse {
    private long requestId;

    private String senderId;

    private String senderName;

    private String senderAvt;

    public GetFriendRequestListResponse(long requestId, String senderId, String senderName, String senderAvt) {
        this.requestId = requestId;
        this.senderId = senderId;
        this.senderName = senderName;
        this.senderAvt = senderAvt;
    }
}
