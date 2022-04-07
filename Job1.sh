#!/bin/bash
#empezar el loop
or a in 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
do 
	#if es igual a 8 que el loop descanse
	if [ $a == 8 ]
	then
		sleep 5
		echo "A descansar de clase $nombre"
	fi
	echo "Clase No $a"
done
sleep 5
echo "Bien $nombre, terminamos la clase de $curso ene idioma $idioma, nos vemos"
