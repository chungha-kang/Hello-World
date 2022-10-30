CREATE TABLE CS_COMMON_BBS (
	    cs_id 		NUMBER	
	  , cs_type		VARCHAR2(20) 	
	  , title	 	VARCHAR2(200)	NOT NULL
	  , content		VARCHAR2(2000)	NOT NULL	
	  , user_id		VARCHAR2(20)	NOT NULL
	  , wdate		DATE	DEFAULT(SYSDATE) NOT NULL			
	  , answer_content	VARCHAR2(2000)	
	  , answer_wdate	DATE	
	  , answer_id	VARCHAR2(20)
	  , answer_state VARCHAR2(20) 
	  , CONSTRAINT CS_COMMON_BBS_CS_ID_PK PRIMARY KEY(cs_id)
	  , CONSTRAINT CS_COMMON_BBS_account_t_USER_ID_FK
	    FOREIGN KEY(user_id) REFERENCES account_t(user_id)
	    
SELECT * FROM CS_COMMON_BBS;

INSERT INTO ACCOUNT_T VALUES('test', 'test', '김테스', 'M', 'test@test.com', '0100000000', 'T', '2022-09-17');

SELECT * FROM ACCOUNT_T;

SELECT * FROM HOUSE_T;

SELECT * FROM ROOM_T;

SELECT * FROM MAP_T;
SELECT * FROM RESERVATION_T;
SELECT * FROM ;

SELECT * FROM ALL_TABLES;

SELECT instance FROM v$thread;


SELECT * FROM v$version;