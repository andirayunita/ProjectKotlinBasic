package carData

open class Car (
    inputName: String,
    inputBrand: String,
    inputModel: String,
    inputColor: String,
    inputYear : Int? = null,
    inputKM : Double? = null) {

    // fields
    private var name : String = inputName
    private var brand: String = inputBrand
    private var model: String = inputModel
    private var color: String = inputColor
    private var year: Int? = inputYear
    private var km: Double? = inputKM

}