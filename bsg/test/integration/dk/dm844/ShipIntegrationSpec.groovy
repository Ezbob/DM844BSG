package dk.dm844

import grails.test.spock.IntegrationSpec
import dk.dm844.bsg.*

class ShipIntegrationSpec extends IntegrationSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "test storing and retrieving a ship"() {
    	given:
    		Ship ship = this.fullyPopulatedShip
    	
    	expect:
            ship.validate()
        when:
            ship.save()
        then:
            ship.id
            Ship.get(ship.id).name == "Battlestar Galactica"

    }
    
    Ship getFullyPopulatedShip() {
	   new Ship(
               name: "Battlestar Galactica",
               crewsize: 1337,
               productionDate: new Date(),
               dateUpdated: new Date(),
               description: "Military headquarter",
               shiptype: Shiptype.MILITARY
    )
}
}
