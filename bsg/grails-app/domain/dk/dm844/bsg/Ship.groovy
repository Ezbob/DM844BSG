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
		name unique: true, blank: false, size: (0..60)
	    crewsize min: 8
	    description nullable: true, blank: true, size: (0..10000)
    }
}
