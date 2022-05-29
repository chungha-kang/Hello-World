SELECT 'Hello Local, DBeaver' FROM DUAL;

--�����(User) ��
--	LOCAL, Docker �� ������ �е��� system ������ �����.
--	Oracle Cloud �� ����ϴ� �е��� admin ������ �����.
--	
--	���� �������� ������ ���� �̴�.
--	
--	�Ϲ� ����� ������ ���� ����� ������ ������ �и�.

-- ������ �н����� �����ϴ� ���
CREATE USER puser1 IDENTIFIED BY Database1234;

-- ������ ������ ���� �ο�
GRANT RESOURCE, CONNECT TO puser1;
GRANT INSERT ANY TABLE, UPDATE ANY TABLE
	, DELETE ANY TABLE, CREATE VIEW
	TO puser1;
GRANT CREATE SESSION TO puser1;	

-- ���̺����̽� ��� ���� �ο�
ALTER USER puser1 quota 10M ON USERS;