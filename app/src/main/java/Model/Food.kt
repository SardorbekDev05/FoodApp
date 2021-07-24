package Model

class Food {
    var name:String?=null
    var ingradient:String?=null
    var preparitionOrder:String?=null

    constructor(name: String?, ingradient: String?, preparitionOrder: String?) {
        this.name = name
        this.ingradient = ingradient
        this.preparitionOrder = preparitionOrder
    }
}