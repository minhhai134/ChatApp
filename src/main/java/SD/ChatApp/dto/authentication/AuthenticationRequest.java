package SD.ChatApp.dto.authentication;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationRequest {
    private String username;
    String password;
}
