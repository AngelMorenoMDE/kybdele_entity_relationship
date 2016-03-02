package entityrelationship.diagram.providers;

import entityrelationship.Attribute;
import entityrelationship.Attribute_Composite;
import entityrelationship.Connection_E_R_Restriction;
import entityrelationship.Connection_With_Attribute;
import entityrelationship.Entity;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.Generalization;
import entityrelationship.Relationship;
import entityrelationship.Relationships_Restriction;
import entityrelationship.TypeAttribute;
import entityrelationship.TypeEntity;
import entityrelationship.TypeIdentifier;
import entityrelationship.TypeRelationship;
import entityrelationship.TypeRestriction;
import entityrelationship.TypeRestriction2;
import entityrelationship.TypeRestrictionInheritance1;
import entityrelationship.TypeRestrictionInheritance2;
import entityrelationship.diagram.expressions.EntityRelationshipAbstractExpression;
import entityrelationship.diagram.expressions.EntityRelationshipOCLFactory;
import entityrelationship.diagram.part.EntityRelationshipDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_Entity_2001(Entity instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(1,
					EntityrelationshipPackage.eINSTANCE.getEntity(), null)
					.evaluate(instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeEntity());
			instance.setType_entity((TypeEntity) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Entity_2002(Entity instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(3,
					EntityrelationshipPackage.eINSTANCE.getEntity(), null)
					.evaluate(instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeEntity());
			instance.setType_entity((TypeEntity) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Relationship_2009(Relationship instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory
					.getExpression(
							5,
							EntityrelationshipPackage.eINSTANCE
									.getRelationship(), null)
					.evaluate(instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeRelationship());
			instance.setType_relationship((TypeRelationship) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Relationship_2010(Relationship instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory
					.getExpression(
							7,
							EntityrelationshipPackage.eINSTANCE
									.getRelationship(), null)
					.evaluate(instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeRelationship());
			instance.setType_relationship((TypeRelationship) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Relationship_2011(Relationship instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory
					.getExpression(
							9,
							EntityrelationshipPackage.eINSTANCE
									.getRelationship(), null)
					.evaluate(instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeRelationship());
			instance.setType_relationship((TypeRelationship) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Attribute_2006(Attribute instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(11,
					EntityrelationshipPackage.eINSTANCE.getAttribute(), null)
					.evaluate(instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeIdentifier());
			instance.setIdentifier((TypeIdentifier) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Attribute_2007(Attribute instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(13,
					EntityrelationshipPackage.eINSTANCE.getAttribute(), null)
					.evaluate(instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeIdentifier());
			instance.setIdentifier((TypeIdentifier) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Attribute_2008(Attribute instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(15,
					EntityrelationshipPackage.eINSTANCE.getAttribute(), null)
					.evaluate(instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeIdentifier());
			instance.setIdentifier((TypeIdentifier) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Attribute_Composite_2013(Attribute_Composite instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(
					17,
					EntityrelationshipPackage.eINSTANCE
							.getAttribute_Composite(), null).evaluate(instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeIdentifier());
			instance.setIdentifier_at_composite((TypeIdentifier) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Generalization_2019(Generalization instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(19,
					EntityrelationshipPackage.eINSTANCE.getGeneralization(),
					null).evaluate(instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE
							.getTypeRestrictionInheritance1());
			instance.setRestriction_inheritance_1((TypeRestrictionInheritance1) value_0);
			Object value_1 = EntityRelationshipOCLFactory.getExpression(20,
					EntityrelationshipPackage.eINSTANCE.getGeneralization(),
					null).evaluate(instance);

			value_1 = EntityRelationshipAbstractExpression.performCast(value_1,
					EntityrelationshipPackage.eINSTANCE
							.getTypeRestrictionInheritance2());
			instance.setRestriction_inheritance_2((TypeRestrictionInheritance2) value_1);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Generalization_2020(Generalization instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(22,
					EntityrelationshipPackage.eINSTANCE.getGeneralization(),
					null).evaluate(instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE
							.getTypeRestrictionInheritance1());
			instance.setRestriction_inheritance_1((TypeRestrictionInheritance1) value_0);
			Object value_1 = EntityRelationshipOCLFactory.getExpression(23,
					EntityrelationshipPackage.eINSTANCE.getGeneralization(),
					null).evaluate(instance);

			value_1 = EntityRelationshipAbstractExpression.performCast(value_1,
					EntityrelationshipPackage.eINSTANCE
							.getTypeRestrictionInheritance2());
			instance.setRestriction_inheritance_2((TypeRestrictionInheritance2) value_1);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Generalization_2021(Generalization instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(25,
					EntityrelationshipPackage.eINSTANCE.getGeneralization(),
					null).evaluate(instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE
							.getTypeRestrictionInheritance1());
			instance.setRestriction_inheritance_1((TypeRestrictionInheritance1) value_0);
			Object value_1 = EntityRelationshipOCLFactory.getExpression(26,
					EntityrelationshipPackage.eINSTANCE.getGeneralization(),
					null).evaluate(instance);

			value_1 = EntityRelationshipAbstractExpression.performCast(value_1,
					EntityrelationshipPackage.eINSTANCE
							.getTypeRestrictionInheritance2());
			instance.setRestriction_inheritance_2((TypeRestrictionInheritance2) value_1);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Generalization_2022(Generalization instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(28,
					EntityrelationshipPackage.eINSTANCE.getGeneralization(),
					null).evaluate(instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE
							.getTypeRestrictionInheritance1());
			instance.setRestriction_inheritance_1((TypeRestrictionInheritance1) value_0);
			Object value_1 = EntityRelationshipOCLFactory.getExpression(29,
					EntityrelationshipPackage.eINSTANCE.getGeneralization(),
					null).evaluate(instance);

			value_1 = EntityRelationshipAbstractExpression.performCast(value_1,
					EntityrelationshipPackage.eINSTANCE
							.getTypeRestrictionInheritance2());
			instance.setRestriction_inheritance_2((TypeRestrictionInheritance2) value_1);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Connection_With_Attribute_4002(
			Connection_With_Attribute instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(
					35,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_With_Attribute(), null).evaluate(
					instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeAttribute());
			instance.setType_attribute((TypeAttribute) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Connection_With_Attribute_4003(
			Connection_With_Attribute instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(
					38,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_With_Attribute(), null).evaluate(
					instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeAttribute());
			instance.setType_attribute((TypeAttribute) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Connection_With_Attribute_4004(
			Connection_With_Attribute instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(
					41,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_With_Attribute(), null).evaluate(
					instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeAttribute());
			instance.setType_attribute((TypeAttribute) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Connection_With_Attribute_4005(
			Connection_With_Attribute instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(
					44,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_With_Attribute(), null).evaluate(
					instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeAttribute());
			instance.setType_attribute((TypeAttribute) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Connection_With_Attribute_4006(
			Connection_With_Attribute instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(
					47,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_With_Attribute(), null).evaluate(
					instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeAttribute());
			instance.setType_attribute((TypeAttribute) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Relationships_Restriction_4007(
			Relationships_Restriction instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(
					50,
					EntityrelationshipPackage.eINSTANCE
							.getRelationships_Restriction(), null).evaluate(
					instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeRestriction());
			instance.setType_restriction((TypeRestriction) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Relationships_Restriction_4008(
			Relationships_Restriction instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(
					54,
					EntityrelationshipPackage.eINSTANCE
							.getRelationships_Restriction(), null).evaluate(
					instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeRestriction());
			instance.setType_restriction((TypeRestriction) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Connection_E_R_Restriction_4012(
			Connection_E_R_Restriction instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(
					60,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_E_R_Restriction(), null).evaluate(
					instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeRestriction2());
			instance.setType_restriction((TypeRestriction2) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Connection_E_R_Restriction_4013(
			Connection_E_R_Restriction instance) {
		try {
			Object value_0 = EntityRelationshipOCLFactory.getExpression(
					64,
					EntityrelationshipPackage.eINSTANCE
							.getConnection_E_R_Restriction(), null).evaluate(
					instance);

			value_0 = EntityRelationshipAbstractExpression.performCast(value_0,
					EntityrelationshipPackage.eINSTANCE.getTypeRestriction2());
			instance.setType_restriction((TypeRestriction2) value_0);
		} catch (RuntimeException e) {
			EntityRelationshipDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = EntityRelationshipDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			EntityRelationshipDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
