SELECT 'Hello Local, DBeaver' FROM DUAL;

--사용자(User) 가
--	LOCAL, Docker 에 구성한 분들은 system 계정을 사용중.
--	Oracle Cloud 를 사용하는 분들은 admin 계정을 사용중.
--	
--	위의 계정들은 관리자 계정 이다.
--	
--	일반 사용자 계정을 새로 만들어 관리자 계정과 분리.

-- 계정과 패스워드 생성하는 방법
CREATE USER puser1 IDENTIFIED BY Database1234;

-- 생성한 계정에 권한 부여
GRANT RESOURCE, CONNECT TO puser1;
GRANT INSERT ANY TABLE, UPDATE ANY TABLE
	, DELETE ANY TABLE, CREATE VIEW
	TO puser1;
GRANT CREATE SESSION TO puser1;	

-- 테이블스페이스 사용 권한 부여
ALTER USER puser1 quota 10M ON USERS;