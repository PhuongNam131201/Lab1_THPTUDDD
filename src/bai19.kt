fun main(){

        for(i in 1..10 ){
            if (i%3==0){
                continue
            }
            else if(i>8){
                break
            }
            print("$i ")
        }

}