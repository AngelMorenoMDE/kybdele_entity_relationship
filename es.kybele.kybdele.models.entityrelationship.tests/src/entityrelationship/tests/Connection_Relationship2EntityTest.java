/**
 */
package entityrelationship.tests;

import entityrelationship.Connection_Relationship2Entity;
import entityrelationship.EntityrelationshipFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connection Relationship2 Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Connection_Relationship2EntityTest extends Connection_EntityRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Connection_Relationship2EntityTest.class);
	}

	/**
	 * Constructs a new Connection Relationship2 Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_Relationship2EntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Connection Relationship2 Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected Connection_Relationship2Entity getFixture() {
		return (Connection_Relationship2Entity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	
	protected void setUp() throws Exception {
		setFixture(EntityrelationshipFactory.eINSTANCE.createConnection_Relationship2Entity());
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

} //Connection_Relationship2EntityTest
