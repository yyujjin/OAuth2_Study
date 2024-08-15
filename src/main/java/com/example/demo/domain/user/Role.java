package com.example.demo.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.web.PortResolverImpl;

@Getter
@RequiredArgsConstructor //왓이즈디스
public enum Role {

    GUEST("ROLE_GUEST","손님"),
    USER("ROLE_USER","일반 사용자");

    private final String key;
    private final String title;
}
