package com.tsien.mall.auth.controller;

import com.tsien.mall.auth.domain.dto.Oauth2TokenDTO;
import com.tsien.mall.auth.util.ClientIdUtil;
import com.tsien.mall.common.constant.AuthConstant;
import com.tsien.mall.common.util.ServerResponse;
import io.swagger.annotations.Api;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * 自定义Oauth2获取令牌接口
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/13 0013 0:07
 */

@RestController
@Api(tags = "AuthController", value = "认证中心登录认证")
@RequestMapping("/oauth")
public class AuthController {

    @Resource
    private TokenEndpoint tokenEndpoint;

    @Resource
    private HttpServletRequest request;

    @PostMapping("/token")
    public ServerResponse<Oauth2TokenDTO> postAccessToken(Principal principal,
                                                          @RequestParam Map<String, String> parameters) throws HttpRequestMethodNotSupportedException {

        OAuth2AccessToken oAuth2AccessToken = tokenEndpoint.postAccessToken(principal, parameters).getBody();
        String clientId = new ClientIdUtil().getClientId(principal);
        request.setAttribute("client_id", clientId);
        Oauth2TokenDTO oauth2TokenDTO = Oauth2TokenDTO.builder()
                .token(oAuth2AccessToken.getValue())
                .refreshToken(oAuth2AccessToken.getRefreshToken().getValue())
                .expiresIn(oAuth2AccessToken.getExpiresIn())
                .tokenHead(AuthConstant.JWT_TOKEN_PREFIX).build();

        return ServerResponse.success(oauth2TokenDTO);
    }

}
