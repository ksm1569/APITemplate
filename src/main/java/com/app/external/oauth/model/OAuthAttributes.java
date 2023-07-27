package com.app.external.oauth.model;

import com.app.domain.member.constant.MemberType;
import com.app.domain.member.constant.Role;
import com.app.domain.member.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.cloud.client.loadbalancer.LoadBalancerProperties;

@ToString
@Getter @Builder
public class OAuthAttributes {

    private String name;
    private String email;
    private String profile;
    private MemberType memberType;

    public Member toMemberEntity(MemberType memberType, Role role){
        return Member.builder()
                .memberType(memberType)
                .email(email)
                .memberName(name)
                .profile(profile)
                .role(role)
                .build();
    }

}
