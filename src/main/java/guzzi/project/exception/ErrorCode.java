package guzzi.project.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    /* 403 BAD_REQUEST : 잘못된 요청 */
    INVALID_REFRESH_TOKEN(FORBIDDEN, "리프레시 토큰이 유효하지 않습니다"),
    MISMATCH_REFRESH_TOKEN(FORBIDDEN, "리프레시 토큰의 유저 정보가 일치하지 않습니다"),
    INVALID_ACCESS_TOKEN(FORBIDDEN, "엑세스 토큰이 만료되었습니다."),
    TOKEN_NOT_FOUND(FORBIDDEN, "토큰이 존재하지 않습니다."),




    /* 401 UNAUTHORIZED : 인증되지 않은 사용자 */
    INVALID_AUTH_TOKEN(UNAUTHORIZED, "권한 정보가 없는 토큰입니다"),
    UNAUTHORIZED_MEMBER(UNAUTHORIZED, "현재 내 계정 정보가 존재하지 않습니다"),

    /* 404 NOT_FOUND : Resource 를 찾을 수 없음 */
    MEMBER_NOT_FOUND(NOT_FOUND, "해당 유저 정보를 찾을 수 없습니다"),
    REFRESH_TOKEN_NOT_FOUND(NOT_FOUND, "로그아웃 된 사용자입니다"),
    VOTE_NOT_FOUND(NOT_FOUND, "해당 게시물을 찾을 수 없습니다."),

    /* 409 CONFLICT : Resource 의 현재 상태와 충돌. 보통 중복된 데이터 존재 */
    DUPLICATE_RESOURCE(CONFLICT, "데이터가 이미 존재합니다"),
    DUPLICATE_DATA(CONFLICT, "기존에 투표했던 내용데이터와 동일합니다");



    private final HttpStatus httpStatus;
    private final String detail;
}
