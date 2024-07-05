@echo off
javac ./*.java
echo Compilación completada
echo.
echo Ejecutando Main...
java -cp src Main
echo.
echo Ejecutando FacturaTest...
java -cp src FacturaTest
echo.
echo Ejecutando EmpleadoTest...
java -cp src EmpleadoTest
echo.
echo Ejecutando IntegerSetTest...
java -cp src IntegerSetTest
pause