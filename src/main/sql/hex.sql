DROP FUNCTION IF EXISTS hex;
CREATE FUNCTION hex(v VARCHAR(255)) RETURNS VARCHAR(255)
LANGUAGE JAVA DETERMINISTIC NO SQL
EXTERNAL NAME 'CLASSPATH:functions.Hex.hex';
.;
