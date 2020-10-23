package com.tsien.mall.auth.config;

import com.tsien.mall.auth.domain.model.SecurityUser;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * JWT增强器
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/12 0012 21:17
 */

@Component
public class JwtTokenEnhancer implements TokenEnhancer {

    /**
     * Provides an opportunity for customization of an access token (e.g. through its additional information map) during
     * the process of creating a new token for use by a client.
     *
     * @param accessToken    the current access token with its expiration and refresh token
     * @param authentication the current authentication including client and user details
     * @return a new token enhanced with additional information
     */
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {

        // 将id和client_id放到jwt中
        SecurityUser securityUser = (SecurityUser) authentication.getPrincipal();
        Map<String, Object> loginInfo = new HashMap<>(16);
        loginInfo.put("id", securityUser.getId());
        loginInfo.put("client_id", securityUser.getClientId());
        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(loginInfo);
        return accessToken;
    }
}
