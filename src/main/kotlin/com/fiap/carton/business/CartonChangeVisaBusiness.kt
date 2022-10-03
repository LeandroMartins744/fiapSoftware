package com.fiap.carton.business

import com.fiap.carton.model.ChargeModel
import com.fiap.carton.model.ClientModel
import com.fiap.carton.repository.CartonChangeRepository
import com.fiap.carton.repository.CartonRepository
import org.springframework.beans.factory.annotation.Autowired

class CartonChangeVisaBusiness: ICartonChangeBusiness {
    @Autowired
    private lateinit var repository: CartonChangeRepository
    @Autowired
    private lateinit var repositoryCarton: CartonRepository
    private val flag: String = "VISA"
    private val rate: Double = 1.8

    override fun Debit(client: ClientModel, value: Double): Boolean {
        return try {
            var carton = repositoryCarton.Carton(client.id, flag)
            if (!carton.isNullOrEmpty()) {
                var item = carton.first()
                if (item!!.limit > (value + (value * this.rate))) {
                    item.limit = item.limit - (value + (value * this.rate))
                    var change = ChargeModel(0, item, value, "DEB")
                    repositoryCarton.save(item)
                    repository.save(change)
                    true
                }
                false
            }
            false
        } catch (ex: Exception) {
            false
        }
    }

    override fun Credit(client: ClientModel, value: Double): Boolean{
        return try {
            var carton = repositoryCarton.Carton(client.id, flag)

            if (!carton.isNullOrEmpty()) {
                var item = carton.first()
                if (item!!.limit > (value + (value * this.rate))) {
                    item.limit = item.limit - (value + (value * this.rate))
                    var change = ChargeModel(0, item, value, "CED")
                    repositoryCarton.save(item)
                    repository.save(change)
                    true;
                }
                false
            }
            false
        }
        catch (ex: Exception){
            false
        }
    }
}