package dk.dm844.bsg


class Ship {
	String name
	Shiptype shiptype
	Integer crewsize
	Date productionDate
	String description
	
	Date dateCreated
	Date dateUpdated
    
    static constraints = {
		name unique: true, blank: false
	    crewsize min: 8
	    description nullable: true, blank: true
    }
}
