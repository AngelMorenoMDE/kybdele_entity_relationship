/**
 */
package entityrelationship.tests;

import entityrelationship.Entity_Relationship_Model;
import entityrelationship.EntityrelationshipFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entity Relationship Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Entity_Relationship_ModelTest extends TestCase {

	/**
	 * The fixture for this Entity Relationship Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Entity_Relationship_Model fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Entity_Relationship_ModelTest.class);
	}

	/**
	 * Constructs a new Entity Relationship Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity_Relationship_ModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Entity Relationship Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Entity_Relationship_Model fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Entity Relationship Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Entity_Relationship_Model getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	
	protected void setUp() throws Exception {
		setFixture(EntityrelationshipFactory.eINSTANCE.createEntity_Relationship_Model());
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

} //Entity_Relationship_ModelTest
