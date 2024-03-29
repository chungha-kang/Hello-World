CREATE USER managerAdmin IDENTIFIED BY StockManager1234; -- Cloud_puser1 / ADMIN 으로 생성 했음

GRANT RESOURCE, CONNECT TO managerAdmin;
GRANT INSERT ANY TABLE, UPDATE ANY TABLE
    , DELETE ANY TABLE, CREATE VIEW
   TO puser1;
GRANT CREATE SESSION TO managerAdmin;

ALTER USER managerAdmin quota 10M ON USERS;

SELECT USERNAME FROM ALL_USERS;

SELECT PRIVILEGE FROM DBA_SYS_PRIVS WHERE GRANTEE = 'managerAdmin';
SELECT GRANTED_ROLE FROM DBA_ROLE_PRIVS WHERE GRANTEE = 'managerAdmin';


-------------------------------------------------------------------------------
CREATE TABLE MD_ACCOUNT (
	   ID			VARCHAR2(30) 	CONSTRAINT PK_MD_ACCOUNT_ID 		PRIMARY KEY
	 , PASSWORD		VARCHAR2(30)	CONSTRAINT NN_MD_ACCOUNT_PASSWORD 	NOT NULL
	 , Name			VARCHAR2(30)	CONSTRAINT NN_MD_ACCOUNT_Name 		NOT NULL
	 , EMPLOYEE_ID	VARCHAR2(30)	CONSTRAINT NN_MD_ACCOUNT_EMPLOYEE_ID NOT NULL
	 , CreateDate	DATE
);

DROP TABLE MD_ACCOUNT ;
INSERT INTO MD_ACCOUNT VALUES ('test1', 'test1', '김테스', 101, sysdate);
SELECT * FROM MD_ACCOUNT;

SELECT * FROM MD_ACCOUNT WHERE ID;

CREATE TABLE MD_CONTROL (
	   Product_no	NUMBER 			CONSTRAINT PK_MD_CONTROL_Product_no		PRIMARY KEY
	 , Brand_name	VARCHAR2(20)	CONSTRAINT NN_MD_CONTROL_Brand_name		NOT NULL
	 , Style_no		VARCHAR2(20)	CONSTRAINT NN_MD_CONTROL_Style_no 		NOT NULL
	 , Store		VARCHAR2(5)		CONSTRAINT NN_MD_CONTROL_Store			NOT NULL
	 , Product_name	VARCHAR2(40)	CONSTRAINT NN_MD_CONTROL_Product_name	NOT NULL
	 , Price		NUMBER			CONSTRAINT NN_MD_CONTROL_Price	 		NOT NULL
	 , Sale_price	NUMBER			CONSTRAINT NN_MD_CONTROL_Sale_price		NOT NULL
	 , Cost_price	NUMBER			CONSTRAINT NN_MD_CONTROL_Cost_price		NOT NULL
	 , Sale_per		VARCHAR2(5)		CONSTRAINT NN_MD_CONTROL_Sale_per		NOT NULL
	 , Margin_per	VARCHAR2(5)		CONSTRAINT NN_MD_CONTROL_Margin_per		NOT NULL
	 , Margin_won	NUMBER			CONSTRAINT NN_MD_CONTROL_Margin_won		NOT NULL
	 , Stock		NUMBER			CONSTRAINT NN_MD_CONTROL_Stock			NOT NULL
	 , ManagerID	VARCHAR2(20)	CONSTRAINT NN_MD_CONTROL_Manager		NOT NULL	
	 , Regi_date	VARCHAR2(20)	CONSTRAINT NN_MD_CONTROL_Regi_date		NOT NULL
	 , Edit_date	VARCHAR2(20)	CONSTRAINT NN_MD_CONTROL_Edit_date		NOT NULL
	 , CONSTRAINT 	FK_MD_CONTROL_MANAGERID FOREIGN KEY(ManagerID) REFERENCES MD_ACCOUNT(ID)
);

CREATE SEQUENCE MD_CONTROL_SEQ NOCACHE;

DROP TABLE MD_CONTROL ;
SELECT * FROM MD_CONTROL;
SELECT * FROM MD_CONTROL_SEQ;