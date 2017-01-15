create table SS_SECURITY_USER (
     id varchar(255),
     password varchar(500),
     name varchar(20),
     isAccountNonExpired boolean,
     isAccountNonLocked boolean,
     isCredentialsNonExpired boolean,
     isEnabled boolean
);


create table SS_SECURITY_AUTHORITY (
    id varchar(255),
    authority_name varchar(20)
);
