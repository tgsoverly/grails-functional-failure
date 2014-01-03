import geb.spock.GebReportingSpec
import spock.lang.*

@Stepwise
class TestSpec extends GebReportingSpec {
        
        def "there should always be google"() {
            when: "i navigate to the main page"
            go "http://www.google.com"

            then: "i am not really testing anything"            
            assert true
        }
}