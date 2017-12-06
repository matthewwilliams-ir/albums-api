ALTER TABLE song DROP CONSTRAINT fk_song_album_id;
ALTER TABLE album DROP CONSTRAINT fk_album_artist_id;
DROP TABLE song;
DROP TABLE album;
DROP TABLE artist;

create sequence hibernate_sequence
;

create table album
(
	id bigint not null
		constraint album_pkey
		primary key,
	confirmed integer,
	release_date date,
	title varchar(255),
	total integer,
	artist_id bigint
)
;

create table artist
(
	id bigint not null
		constraint artist_pkey
		primary key,
	name varchar(255)
)
;

alter table album
	add constraint fkmwc4fyyxb6tfi0qba26gcf8s1
foreign key (artist_id) references artist
;

create table song
(
	id bigint not null
		constraint song_pkey
		primary key,
	features varchar(255),
	is_confirmed boolean,
	primary_artist varchar(255),
	producers varchar(255),
	title varchar(255),
	track_no integer,
	album_id bigint
		constraint fkrcjmk41yqj3pl3iyii40niab0
		references album
)
;