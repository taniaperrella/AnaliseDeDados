fun main() {

   
   val rawData = mapOf(
       				  "users1.csv" to listOf (32, 45, 17, -1, 34),
                      "users2.csv" to listOf (19,-1, 67, 22),
                      "users3.csv" to listOf (15, -124, 0, 12),
                      "users4.csv" to listOf (56,32,18,44)
                      )
   
   //Question 1
   //
 	fun average(map: Map<String, List<Int>>){
        
        var listOfAges: MutableList<Int> = mutableListOf()
        
        for (ageRawList in map.values){
            var filteredData = ageRawList.filter {age -> age >0}
            
            listOfAges.addAll(filteredData)
        }
        
        val averageAge = listOfAges.average()
        return println(listOfAges)
    }
    average(rawData)
   
}
