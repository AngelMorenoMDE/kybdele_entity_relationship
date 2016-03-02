package entityrelationship.diagram.edit.policies;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

import entityrelationship.Attribute;
import entityrelationship.Attribute_Composite;
import entityrelationship.Connection_ConnectionEntityRelationship2Attribute;
import entityrelationship.Connection_E_R_Restriction;
import entityrelationship.Connection_Entity2Relationship;
import entityrelationship.Connection_EntityRelationship;
import entityrelationship.Connection_Generalization_Entity;
import entityrelationship.Connection_Relationship2Entity;
import entityrelationship.Connection_With_Attribute;
import entityrelationship.Elements_with_Attributes;
import entityrelationship.Entity;
import entityrelationship.Entity_Relationship_Model;
import entityrelationship.EntityrelationshipPackage;
import entityrelationship.Generalization;
import entityrelationship.Relationship;
import entityrelationship.Relationships_Restriction;
import entityrelationship.diagram.expressions.EntityRelationshipOCLFactory;
import entityrelationship.diagram.part.EntityRelationshipDiagramEditorPlugin;
import entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry;
import entityrelationship.diagram.providers.EntityRelationshipElementTypes;

/**
 * @generated
 */
public class EntityRelationshipBaseItemSemanticEditPolicy extends
		SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected EntityRelationshipBaseItemSemanticEditPolicy(
			IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						EntityRelationshipVisualIDRegistry
								.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = EntityRelationshipElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = EntityRelationshipDiagramEditorPlugin
				.getInstance().getLinkConstraints();
		if (cached == null) {
			EntityRelationshipDiagramEditorPlugin.getInstance()
					.setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnection_Generalization_Entity_4019(
				Entity_Relationship_Model container, Generalization source,
				Entity target) {
			return canExistConnection_Generalization_Entity_4019(container,
					null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnection_Relationship2Entity_4021(
				Entity_Relationship_Model container, Relationship source,
				Entity target) {
			return canExistConnection_Relationship2Entity_4021(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnection_Entity2Relationship_4020(
				Entity_Relationship_Model container, Entity source,
				Relationship target) {
			return canExistConnection_Entity2Relationship_4020(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnection_With_Attribute_4002(
				Entity_Relationship_Model container,
				Elements_with_Attributes source, Attribute target) {
			return canExistConnection_With_Attribute_4002(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnection_With_Attribute_4003(
				Entity_Relationship_Model container,
				Elements_with_Attributes source, Attribute target) {
			return canExistConnection_With_Attribute_4003(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnection_With_Attribute_4004(
				Entity_Relationship_Model container,
				Elements_with_Attributes source, Attribute target) {
			return canExistConnection_With_Attribute_4004(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnection_With_Attribute_4005(
				Entity_Relationship_Model container,
				Elements_with_Attributes source, Attribute target) {
			return canExistConnection_With_Attribute_4005(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnection_With_Attribute_4006(
				Entity_Relationship_Model container,
				Elements_with_Attributes source, Attribute target) {
			return canExistConnection_With_Attribute_4006(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRelationships_Restriction_4007(
				Entity_Relationship_Model container, Relationship source,
				Relationship target) {
			return canExistRelationships_Restriction_4007(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRelationships_Restriction_4008(
				Entity_Relationship_Model container, Relationship source,
				Relationship target) {
			return canExistRelationships_Restriction_4008(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAttributeAttributes_composites_4009(
				Attribute source, Attribute_Composite target) {
			if (source != null) {
				if (source.getAttributes_composites().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}
			if (target != null && (target.getInAttribute() != null)) {
				return false;
			}

			return canExistAttributeAttributes_composites_4009(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnection_E_R_Restriction_4012(
				Entity_Relationship_Model container,
				Connection_EntityRelationship source,
				Connection_EntityRelationship target) {
			return canExistConnection_E_R_Restriction_4012(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnection_E_R_Restriction_4013(
				Entity_Relationship_Model container,
				Connection_EntityRelationship source,
				Connection_EntityRelationship target) {
			return canExistConnection_E_R_Restriction_4013(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateGeneralizationSuperclass_4017(
				Generalization source, Entity target) {
			if (source != null) {
				if (source.getSuperclass() != null) {
					return false;
				}
			}

			return canExistGeneralizationSuperclass_4017(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnection_ConnectionEntityRelationship2Attribute_4022(
				Entity_Relationship_Model container,
				Connection_EntityRelationship source, Attribute target) {
			return canExistConnection_ConnectionEntityRelationship2Attribute_4022(
					container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistConnection_Generalization_Entity_4019(
				Entity_Relationship_Model container,
				Connection_Generalization_Entity linkInstance,
				Generalization source, Entity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnection_Relationship2Entity_4021(
				Entity_Relationship_Model container,
				Connection_Relationship2Entity linkInstance,
				Relationship source, Entity target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getEntity()); //$NON-NLS-1$
					Object sourceVal = EntityRelationshipOCLFactory
							.getExpression(
									30,
									EntityrelationshipPackage.eINSTANCE
											.getRelationship(), env).evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getRelationship()); //$NON-NLS-1$
					Object targetVal = EntityRelationshipOCLFactory
							.getExpression(
									31,
									EntityrelationshipPackage.eINSTANCE
											.getEntity(), env).evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				EntityRelationshipDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistConnection_Entity2Relationship_4020(
				Entity_Relationship_Model container,
				Connection_Entity2Relationship linkInstance, Entity source,
				Relationship target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getRelationship()); //$NON-NLS-1$
					Object sourceVal = EntityRelationshipOCLFactory
							.getExpression(
									32,
									EntityrelationshipPackage.eINSTANCE
											.getEntity(), env).evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getEntity()); //$NON-NLS-1$
					Object targetVal = EntityRelationshipOCLFactory
							.getExpression(
									33,
									EntityrelationshipPackage.eINSTANCE
											.getRelationship(), env).evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				EntityRelationshipDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistConnection_With_Attribute_4002(
				Entity_Relationship_Model container,
				Connection_With_Attribute linkInstance,
				Elements_with_Attributes source, Attribute target) {
			try {
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getElements_with_Attributes()); //$NON-NLS-1$
					Object targetVal = EntityRelationshipOCLFactory
							.getExpression(
									36,
									EntityrelationshipPackage.eINSTANCE
											.getAttribute(), env).evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				EntityRelationshipDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistConnection_With_Attribute_4003(
				Entity_Relationship_Model container,
				Connection_With_Attribute linkInstance,
				Elements_with_Attributes source, Attribute target) {
			try {
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getElements_with_Attributes()); //$NON-NLS-1$
					Object targetVal = EntityRelationshipOCLFactory
							.getExpression(
									39,
									EntityrelationshipPackage.eINSTANCE
											.getAttribute(), env).evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				EntityRelationshipDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistConnection_With_Attribute_4004(
				Entity_Relationship_Model container,
				Connection_With_Attribute linkInstance,
				Elements_with_Attributes source, Attribute target) {
			try {
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getElements_with_Attributes()); //$NON-NLS-1$
					Object targetVal = EntityRelationshipOCLFactory
							.getExpression(
									42,
									EntityrelationshipPackage.eINSTANCE
											.getAttribute(), env).evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				EntityRelationshipDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistConnection_With_Attribute_4005(
				Entity_Relationship_Model container,
				Connection_With_Attribute linkInstance,
				Elements_with_Attributes source, Attribute target) {
			try {
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getElements_with_Attributes()); //$NON-NLS-1$
					Object targetVal = EntityRelationshipOCLFactory
							.getExpression(
									45,
									EntityrelationshipPackage.eINSTANCE
											.getAttribute(), env).evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				EntityRelationshipDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistConnection_With_Attribute_4006(
				Entity_Relationship_Model container,
				Connection_With_Attribute linkInstance,
				Elements_with_Attributes source, Attribute target) {
			try {
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getElements_with_Attributes()); //$NON-NLS-1$
					Object targetVal = EntityRelationshipOCLFactory
							.getExpression(
									48,
									EntityrelationshipPackage.eINSTANCE
											.getAttribute(), env).evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				EntityRelationshipDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistRelationships_Restriction_4007(
				Entity_Relationship_Model container,
				Relationships_Restriction linkInstance, Relationship source,
				Relationship target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getRelationship()); //$NON-NLS-1$
					Object sourceVal = EntityRelationshipOCLFactory
							.getExpression(
									51,
									EntityrelationshipPackage.eINSTANCE
											.getRelationship(), env).evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getRelationship()); //$NON-NLS-1$
					Object targetVal = EntityRelationshipOCLFactory
							.getExpression(
									52,
									EntityrelationshipPackage.eINSTANCE
											.getRelationship(), env).evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				EntityRelationshipDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistRelationships_Restriction_4008(
				Entity_Relationship_Model container,
				Relationships_Restriction linkInstance, Relationship source,
				Relationship target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getRelationship()); //$NON-NLS-1$
					Object sourceVal = EntityRelationshipOCLFactory
							.getExpression(
									55,
									EntityrelationshipPackage.eINSTANCE
											.getRelationship(), env).evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getRelationship()); //$NON-NLS-1$
					Object targetVal = EntityRelationshipOCLFactory
							.getExpression(
									56,
									EntityrelationshipPackage.eINSTANCE
											.getRelationship(), env).evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				EntityRelationshipDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistAttributeAttributes_composites_4009(
				Attribute source, Attribute_Composite target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getAttribute_Composite()); //$NON-NLS-1$
					Object sourceVal = EntityRelationshipOCLFactory
							.getExpression(
									57,
									EntityrelationshipPackage.eINSTANCE
											.getAttribute(), env).evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getAttribute()); //$NON-NLS-1$
					Object targetVal = EntityRelationshipOCLFactory
							.getExpression(
									58,
									EntityrelationshipPackage.eINSTANCE
											.getAttribute_Composite(), env)
							.evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				EntityRelationshipDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistConnection_E_R_Restriction_4012(
				Entity_Relationship_Model container,
				Connection_E_R_Restriction linkInstance,
				Connection_EntityRelationship source,
				Connection_EntityRelationship target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getConnection_EntityRelationship()); //$NON-NLS-1$
					Object sourceVal = EntityRelationshipOCLFactory
							.getExpression(
									61,
									EntityrelationshipPackage.eINSTANCE
											.getConnection_EntityRelationship(),
									env).evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getConnection_EntityRelationship()); //$NON-NLS-1$
					Object targetVal = EntityRelationshipOCLFactory
							.getExpression(
									62,
									EntityrelationshipPackage.eINSTANCE
											.getConnection_EntityRelationship(),
									env).evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				EntityRelationshipDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistConnection_E_R_Restriction_4013(
				Entity_Relationship_Model container,
				Connection_E_R_Restriction linkInstance,
				Connection_EntityRelationship source,
				Connection_EntityRelationship target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getConnection_EntityRelationship()); //$NON-NLS-1$
					Object sourceVal = EntityRelationshipOCLFactory
							.getExpression(
									65,
									EntityrelationshipPackage.eINSTANCE
											.getConnection_EntityRelationship(),
									env).evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getConnection_EntityRelationship()); //$NON-NLS-1$
					Object targetVal = EntityRelationshipOCLFactory
							.getExpression(
									66,
									EntityrelationshipPackage.eINSTANCE
											.getConnection_EntityRelationship(),
									env).evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				EntityRelationshipDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistGeneralizationSuperclass_4017(
				Generalization source, Entity target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnection_ConnectionEntityRelationship2Attribute_4022(
				Entity_Relationship_Model container,
				Connection_ConnectionEntityRelationship2Attribute linkInstance,
				Connection_EntityRelationship source, Attribute target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getAttribute()); //$NON-NLS-1$
					Object sourceVal = EntityRelationshipOCLFactory
							.getExpression(
									67,
									EntityrelationshipPackage.eINSTANCE
											.getConnection_EntityRelationship(),
									env).evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				if (target == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", EntityrelationshipPackage.eINSTANCE.getConnection_EntityRelationship()); //$NON-NLS-1$
					Object targetVal = EntityRelationshipOCLFactory
							.getExpression(
									68,
									EntityrelationshipPackage.eINSTANCE
											.getAttribute(), env).evaluate(
									target,
									Collections.singletonMap(
											"oppositeEnd", source)); //$NON-NLS-1$
					if (false == targetVal instanceof Boolean
							|| !((Boolean) targetVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				EntityRelationshipDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}
	}

}
