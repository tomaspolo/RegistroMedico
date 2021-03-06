DROP TABLE REGISTROS IF EXISTS;
DROP TABLE USUARIOS IF EXISTS;
DROP TABLE SECUENCIAS IF EXISTS;


CREATE TABLE USUARIOS (

	DNI 				VARCHAR(15)		NOT NULL,
	NOMBRE 				VARCHAR (30)	,
	APELLIDO1 			VARCHAR (30)	,
	APELLIDO2 			VARCHAR (30)	,
	SEXO 				VARCHAR (20)	,
	FECHA_NACIMIENTO 	TIMESTAMP		,
	ALTURA 				DOUBLE			,
	OBSERVACIONES 		VARCHAR (140)	,
	
	PRIMARY KEY(DNI)

);

CREATE TABLE REGISTROS (

	CODIGO 				BIGINT			NOT NULL,
	DNI_USUARIO 		VARCHAR(15)		NOT NULL,
	FECHA_REGISTRO 		TIMESTAMP		,
	LATITUD 			DOUBLE			,
	LONGITUD 			DOUBLE			,
	PESO 				DOUBLE			,
	PRESION_MIN			DOUBLE			,
	PRESION_MAX			DOUBLE			,
	NUMERO_PASOS		INT				,
	
	PRIMARY KEY(CODIGO),
	FOREIGN KEY (DNI_USUARIO) REFERENCES USUARIOS(DNI)

);

CREATE TABLE SECUENCIAS(

	NOMBRE_SECUENCIA	VARCHAR(100)	NOT NULL,
	VALOR_SECUENCIA		BIGINT			NOT NULL

);
