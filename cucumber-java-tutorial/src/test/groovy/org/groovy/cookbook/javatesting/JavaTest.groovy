
package org.groovy.cookbook.javatesting
import org.groovy.cookbook.StringUtil
class JavaTest extends GroovyTestCase {
	def stringUtil = new StringUtil()
	void testConcatenation() {
		def result = stringUtil.concat(['Luke', 'John'], '-')
		assertToString('Luke-John', result)
	}
	void testConcatenationWithEmptyList() {
		def result = stringUtil.concat([], ',')
		assertEquals('', result)
	}
}