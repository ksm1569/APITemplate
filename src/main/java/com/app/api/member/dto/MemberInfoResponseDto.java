package com.app.api.member.dto;

import com.app.domain.member.constant.Role;
import com.app.domain.member.entity.Member;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

@Getter @Builder
public class MemberInfoResponseDto {

    @Schema(description = "회원 아이디", example = "1", required = true)
    private Long memberId;

    @Schema(description = "이메일 주소", example = "tnals1569@gmail.com", required = true)
    private String email;

    @Schema(description = "회원명", example = "김수민", required = true)
    private String memberName;

    @Schema(description = "프로필 이미지 경로", example = "http://test.com/img_50x50.jpg", required = true)
    private String profile;

    @Schema(description = "회원의 권한", example = "USER", required = true)
    private Role role;

    public static MemberInfoResponseDto of(Member member) {
        return MemberInfoResponseDto.builder()
                .memberId(member.getMemberId())
                .email(member.getEmail())
                .memberName(member.getMemberName())
                .profile(member.getProfile())
                .role(member.getRole())
                .build();
    }
}
