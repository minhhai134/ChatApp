package SD.ChatApp.dto.authentication;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Oauth2UserInfoDto {
    private String name;
    private String username;
    private String avatar;
    private String id;

}
