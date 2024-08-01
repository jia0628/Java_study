/*
< 서브쿼리 내용 부분 추가 >
1. exists 연산자
- 서브쿼리의 데이터가 존재하는지를 확인하고 존재하면 true, 존재하지 않으면 false를 리턴

문제1) 10번 부서에 해당하는 부서명이 존재한다면 사원의 정보를 출력하시오.
문제2) 50번 부서에 해당하는 부서명이 존재한다면 사원의 정보를 출력하시오.
*/

-- 1번:  사원 정보 출력함
select * from employee
where exists (select dno from employee where dno = 10);

-- 2번: 사원 정보를 출력하지 않음
select * from employee
where exists (select dno from employee where dno = 50);

/*
< DML >
    - 생성된 테이블에 데이터를 조회, 추가, 수정, 삭제하는 명령
    - select(데이터 조회) 정리
    - insert(데이터 추가), update(데이터 수정), delete(데이터 삭제)
    - sqldeveloper에서는 commit(확정) 명령을 사용해야 DB서버에 반영이 된다.

    1. insert문
        insert into 테이블명(컬럼명, 컬럼명, ...) values(값, 값, ...);
        
    - 1번 방법: 컬럼과 컬럼에 대한 값을 정확하게 나열하여 추가하는 방법
    insert into dept(dno, dname, loc) values(10, '회계팀', '과천');
    
    - 2번 방법: 특정 컬럼만 값을 추가하는 방법
    - 추가하지 않은 컬럼의 값은 null이 됨.
    - 명시적으로 null을 추가할 수도 있음.
    - not null인 컬럼은 생략할 수 없음.★
    insert into dept(dno, dname) values(20, '연구팀');
    
    - 3번 방법: 컬럼명을 생략하는 방법
    - 테이블의 모든 컬럼의 값을 생성한 순서대로 누락없이 입력할 때만 가능
    
    - 4번 방법: 다른 테이블의 데이터를 추가하는 방법
    
*/

-- 테이블 확인
select table_name, status from user_tables;

-- 테이블 삭제
drop table emp;
drop table dept;

-- 테이블 복제
create table emp as select * from employee where 0 = 1;
create table dept as select * from department where 0 = 1;

-- 테이블 데이터 확인, 구조 확인
select * from emp;
desc emp;
select * from dept;
desc dept;

-- 1번 추가: 컬럼명, 값을 차례대로 모두 나열하여 추가하는 방법
insert into dept(dno, dname, loc) values(10, '회계팀', '서울');
commit;
select * from dept;

-- 2번 추가: 특정 컬럼만 추가하는 방법 1번(추가하지 않는 컬럼 생략)
insert into dept(dno, dname) values(20, '연구팀');
commit;
select * from dept;

-- 2번 추가: 특정 컬럼만 추가하는 방법 2번(추가하지 않는 컬럼을 null로 삽입)
insert into dept(dno, dname, loc) values(30, '영업팀', null);
commit;
select * from dept;

-- 3번 추가: 컬럼명을 생략하는 방법
insert into dept values(40, '운영팀', '일산');
commit;
select * from dept;

-- 에러: SQL 오류: ORA-00947: 값의 수가 충분하지 않습니다
insert into dept values(50, '기획팀');

-- 가능: 컬럼명을 생략하고, 삽입하지 않는 컬럼은 null을 추가하면 됨.
insert into dept values(50, '기획팀', null);
commit;
select * from dept;

-- 날짜 데이터를 추가하는 방법
-- 날짜형식: yyyy/mm/dd, yy/mm/dd, yyyy-mm-dd
insert into emp(eno, ename, hiredate) values(1000, '이정재', '2024/03/02');
commit;
select eno, ename, to_char(hiredate, 'yyyy-mm-dd') from emp;

insert into emp(eno, ename, hiredate) values(2000, '이병헌', '24/03/03');
commit;
select * from emp;
select eno, ename, to_char(hiredate, 'yyyy/mm/dd') from emp;

insert into emp(eno, ename, hiredate) values(3000, '위하준', '2024-03-04');
commit;
select * from emp;
select eno, ename, to_char(hiredate, 'yy/mm/dd') from emp;

-- 오늘 날짜를 추가, sysdate
insert into emp(eno, ename, hiredate) values(4000, '공유', sysdate);
commit;
select eno "사번", ename "사원명", to_char(hiredate, 'yyyy-mm-dd') "입사날짜" from emp;

-- 1번 - 다른 테이블의 모든 데이터를 복사하여 추가
insert into emp select * from employee;
commit;
select * from emp;

-- 2번 - 다른 테이블의 특정 데이터만 복사하여 추가
truncate table emp;
insert into emp select * from employee where dno = 10;
commit;
select * from emp;

-- 3번 - 다른 테이블의 특정 컬럼만 복사하여 추가
insert into emp(eno, ename, job, hiredate, salary) select eno, ename, job, hiredate, salary from employee;
commit;
select * from emp;

-- 에러: SQL 오류: ORA-00947: 값의 수가 충분하지 않습니다
insert into emp select eno, ename, job, hiredate, salary from employee;

/*
< DML >
    2. update문
    - 테이블의 데이터를 조건에 의해서 수정하는 명령문
    update 필드명
    set 변경할 컬럼과 값
    where 조건식

*/

truncate table emp;
truncate table dept;
insert into emp select * from employee;
insert into dept select * from department;
commit;

select * from emp;
select * from dept;
select table_name from user_tables;

-- 문제1) 30번 부서의 업무를 CLARK으로 변경하시오.
update emp
set job = 'CLARK'
where dno = 30;

commit;

-- 문제2) SCOTT 사원의 연봉을 4000으로 수정하시오.
update emp
set salary = 4000
where ename = 'SCOTT';
commit;

-- 문제3) 10번 부서의 부서명을 PROGRAMMING, 지역명을 SEOUL로 변경하시오.
update dept
set dname = 'PROGRAMMING', loc = 'SEOUL'
where dno = 10;
commit;

-- 문제4) 20번 부서의 지역명을 30번 부서의 지역명으로 변경하시오.
update dept
set loc = (select loc from dept where dno = 30)
where dno = 20;
commit;

-- 문제5) 40번 부서의 부서명과 지역명을 10번 부서의 부서명과 지역명으로 변경하시오.
-- 다중열 서브쿼리(조건이 같을때만 사용 가능)
update dept
set (dname, loc) = (select dname, loc from dept where dno = 10) 
where dno = 40;
commit;

-- 문제6) 10번 부서에서 근무하는 사원의 연봉을 10% 인상하시오.
update emp
set salary = salary + salary * 0.1
where dno = 10;
rollback;
commit;

-- 문제7) 사번이 7788인 사원의 업무와 급여를 사번이 7499인 사원의 업무와 급여와 일치하도록 수정하시오.
update emp
set (job, salary) = (select job, salary from emp where eno = 7499)
where eno = 7788;
commit;

select * from emp;
select * from dept;

-- 문제) 30번 부서에서 근무하고, 업무가 SALESMAN인 사원의 연봉을20% 인상하고, 성과금을 100더해서 인상하도록 수정하시오.
update emp
set salary = salary + salary * 0.2, commission = nvl(commission, 0) + 100
where dno = 30 and job = 'SALESMAN';

/*
< DML >
    3. delete
    - 테이블에서 조건에 해당하는 데이터를 삭제하는 명령문
    - from은 생략가능(오라클에서는)
    delete from 테이블명
    where 조건식

*/

-- 문제1) dept 테이블에서 10부서의 데이터를 삭제하시오.
delete from dept
where dno = 10;

select * from dept;
commit;

-- 테이블 삭제하고 다시 값 추가
truncate table emp;
truncate table dept;

insert into emp select * from employee;
insert into dept select * from department;
commit;
select * from emp;
select * from dept;

-- 문제2) RESEARCH 부서를 삭제하시오.
delete dept where dname = 'RESEARCH';
select * from dept;
commit;

-- 문제3) 연봉이 1000보다 작은 사원의 정보를 삭제하시오.
delete emp where salary < 1000;
select * from emp;
commit;

-- 문제4) 상관이 없는 사원의 정보를 삭제하시오.
delete emp where manager is null;
select * from emp;
commit;

-- 문제5) 연봉이 1000에서 2000(포함) 사이의 사원의 정보를 삭제하시오.
delete emp where salary between 1000 and 2000;
select * from emp;
commit;

-- 문제6) SALES 부서에서 근무하는 사원의 정보를 삭제하시오.
delete emp where dno = (select dno from dept where dname = 'SALES');
select * from emp;
commit;

-- 문제7) 부서번호가 10 또는 40인 부서를 삭제하시오.
delete dept where dno in (10, 40);
select * from dept;
commit;

-- 문제8) emp 테이블에서 모든 데이터를 삭제하시오.
-- where절을 사용하지 않으면 모든 데이터를 삭제
delete from emp;
select * from emp;
commit;

/*
< truncate table, delete from의 차이 >
1. truncate table : 메모리의 공간까지 모두 삭제, 모든 데이터를 삭제할 때 권장, DDL(commit이 필요없음)
2. delete from : 데이터만 삭제(메모리의 공간은 남아있음), 조건식에 대한 데이터를 삭제할 때 사용, DML(commit이 필요함)

    ★★★★★
    < 제약 조건 (Constraint Rule) >
    - 데이터가 무결성을 가지도록 하는 조건
    - 테이블에 유효하지 않은 데이터는 입력할 수 없도록 각 컬럼에 설정하는 조건
    
    < null과 not null >
    1. null : 값이 없어도 되는 상태
    2. not null : 값이 반드시 존재해야 하는 상태
    
    < RDBMS의 여러 가지 키 >
    1. 후보키(Candidate key)
    - 기본키가 될 수 있는 키들
    
    2. 기본키(primary key)
    - 후보키들 중에서 기본키로 선택된 키
    
    3. 대체키(alternate key)
    - 후보키들 중에서 기본키로 선택된 키가 아닌 키
    
    4. 슈퍼키(super key)
    - 두 개 이상의 컬럼을 사용하여 기본키로 사용할 수 있도록 만든 키
    
    < 제약 조건의 종류 >
        1. not null
        - 컬럼에 null값을 갖지 못하도록 저장하는 것
        
        2. unique
        - 모든 데이터 중에서 유일한 값을 가지도록 하는 것
        
        3. primary key
        - 기본키(주키), 표기할 때는 PK
        - 컬럼에 null값을 가질 수 없고, 유일한 값을 가지도록 하는 것
        - not null과 unique를 합친 제약 조건
        
        4. foreign key
        - 외래키, 표기할 때는 FR
        - 자식 테이블에 컬럼이 부모 테이블의 특정 컬럼을 참조하도록 만든 키
        - 참조 무결성을 설정하는 키
        
        5.

*/

