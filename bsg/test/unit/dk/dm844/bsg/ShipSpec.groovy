package dk.dm844.bsg

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Ship)
class ShipSpec extends Specification {

    def setup() {
    // Adds the validate method to the domain (or command object) class
    	mockForConstraintsTests(Ship)
	}

    def cleanup() {
    }

    void "Test something"() {
 		expect:
 			true
    }
}
