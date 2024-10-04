fun main(){
    var a:Int
    while (true){
        println("Nhập giá trị mảng: ")
        val input = readLine()
        a=input?.toIntOrNull()?:0
        if(a>0){
            break
        }
        else{
            println("Nhập giá trị thích hợp: ")
        }
    }

    val mang = IntArray(a)

        for(i in mang.indices){
            while(true){
                println("Nhap gia tri cho phan tu mang: $i")
                val input = readLine()
                if(input != null && input.toIntOrNull()!=null){
                    mang[i]=input.toInt()
                    break
                }
                else{
                    println("Vui long nhap gia tri thich hop")
                }
            }

        }

    val max = mang.maxOrNull()
    println("Max: $max")
    var maxa=mang[0]
    for (i in 1 until a){
        if (maxa <= mang[i]){
            maxa =mang[i]
        }
    }
    println("Maxa: $maxa")
}