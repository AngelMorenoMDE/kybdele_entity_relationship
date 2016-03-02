/**
 */
package entityrelationship.tests;

import entityrelationship.Connection_Entity2Relationship;
import entityrelationship.EntityrelationshipFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connection Entity2 Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Connection_Entity2RelationshipTest extends Connection_EntityRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Connection_Entity2RelationshipTest.class);
	}

	/**
	 * Constructs a new Connection Entity2 Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_Entity2RelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Connection Entity2 Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected Connection_Entity2Relationship getFixture() {
		return (Connection_Entity2Relationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	
	protected void setUp() throws Exception {
		setFixture(EntityrelationshipFactory.eINSTANCE.createConnection_Entity2Relationship());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //Connection_Entity2RelationshipTest
