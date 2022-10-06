val numeros = mutableListOf<Int>()  //creamos variable que indicara la cantidad en una lista

fun main() { //creamos la funcion
    var frame = 1         //creamos variable que indica nuestros frame
    var nTiradas = 1    //creamos variable que indica nuestras tiradas
    var aux = 0           //creamos variable que indica nuetro auxiliar
    var x=2;              //Una variable equis que funcionara como nuestro contador

    while(frame <= 10){     //se pone un while para hacer la validacion de a variable frame si es menor o igual a 10
        var tirada = readLine()!!.toInt()  //creamos una variable nueva que nos ayudara en el while a leerla
        numeros.add(tirada)  //Agregamos en nuestra variable numero lo que se lee en tirada

        if(tirada == 10 && frame == 10 && nTiradas == 1){ //en el siuiemte if hacemos 3 validaciones
            //en caso de que entre a este if se hacen las siguientes peticiones
            tirada = readLine()!!.toInt() //en la variable tirada leemos
            numeros.add(tirada) // lo agregamos en la lista
            tirada = readLine()!!.toInt()  // de nuevo leemos numero
            numeros.add(tirada) // se agrega a la lista de tiradas
            x==1 // vamos usando nuestro indicador

            //spare
        } else if(tirada + aux == 10 && frame == 10 && nTiradas == 2) { // vemos si se cumple alguna de las
            //3 validaciones para que pueda entrar al if
            tirada = readLine()!!.toInt() // si lo cumple leemos un numero
            numeros.add(tirada) //Guardamos en la lista
            nTiradas=1 //le decimos que en numero de tiradas sera 1
            frame++ // incrementamos frame


        } else if(tirada == 10 && frame == 10 && nTiradas == 2 ) { // en caso de no cumplir el if de arriba
            // vemos si entra en este if, que ahora indicara si es ==  10
            tirada = readLine()!!.toInt() // si se cumple unas de las 3 validaciones, entra e leer la
            //siguiete tirada
            numeros.add(tirada) // se almacena la tirada en la lista
            nTiradas=1 // le agregamos a la tirada 1 mas
            frame++ // incrementamos a frame

            //strike
        } else if(tirada==10 && nTiradas==1 ){  //vemos si se cmmple alguna de las dos validaciones
            frame++ //si cumple, incrementamos frame
        } else { // en caso de que no lo sea
            if(nTiradas==1){ // si las tiradas son = 1
                nTiradas=2 // ahora la validacion sera 2
            }else{ // si no
                frame++ // frame incrementa
                nTiradas=1 // y tiradas se regresa a 1
            }
        }
        aux=tirada //hacemos el uso del auxiliar almacenando lo que tenemos en tiradas
        println(numeros) // imprimimos numeros que se acumularos
        println(frame)   // nuestros frame que se cumplieron

    }

suma() // llamamos la funcion de suma para calcular el total de los puntos
}

fun suma(){

    println(numeros.sum()) // haacemos la suma de los numeros que fueron acumulados
}