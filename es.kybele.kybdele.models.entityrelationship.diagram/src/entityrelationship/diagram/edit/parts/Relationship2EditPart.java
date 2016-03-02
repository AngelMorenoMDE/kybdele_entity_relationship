package entityrelationship.diagram.edit.parts;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import entityrelationship.Relationship;
import entityrelationship.diagram.edit.parts.custom.AutomaticCardinalityRelationship;
import entityrelationship.diagram.edit.parts.custom.DefaultSizeNodeFigureWithFixedAnchors2;
import entityrelationship.diagram.edit.policies.Relationship2CanonicalEditPolicy;
import entityrelationship.diagram.edit.policies.Relationship2ItemSemanticEditPolicy;
import entityrelationship.diagram.part.EntityRelationshipVisualIDRegistry;

/**
 * @generated
 */
public class Relationship2EditPart extends AbstractBorderedShapeEditPart {
	/**
	 * @generated
	 * 
	 */
	public void performRequest(Request request) {

		if (request.getType() == RequestConstants.REQ_OPEN) {
			try {
				PlatformUI.getWorkbench().getActiveWorkbenchWindow()
						.getActivePage()
						.showView("org.eclipse.ui.views.PropertySheet");
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		super.performRequest(request);
	}

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2010;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public Relationship2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Relationship2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new Relationship2CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (EntityRelationshipVisualIDRegistry
						.getVisualID(childView)) {
				case RelationshipCardinality2EditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy() {

						protected List createSelectionHandles() {
							MoveHandle mh = new MoveHandle(
									(GraphicalEditPart) getHost());
							mh.setBorder(null);
							return Collections.singletonList(mh);
						}
					};
				}
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new WeakExistenceRelationshipFigure();
	}

	/**
	 * @generated
	 */
	public WeakExistenceRelationshipFigure getPrimaryShape() {
		return (WeakExistenceRelationshipFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RelationshipName_relationship2EditPart) {
			((RelationshipName_relationship2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureWeakExistenceRelationshipName_relationshipFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RelationshipName_relationship2EditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer,
			IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof RelationshipCardinality2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.NORTH);
			locator.setBorderItemOffset(new Dimension(-5, -5));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		HashMap<String, PrecisionPoint> anchorLocations = new HashMap<String, PrecisionPoint>();
		anchorLocations.put("WEST", new PrecisionPoint(0, 0.5d));
		anchorLocations.put("EAST", new PrecisionPoint(1d, 0.5d));
		anchorLocations.put("NORTH", new PrecisionPoint(0.5d, 0));
		anchorLocations.put("SOUTH", new PrecisionPoint(0.5d, 1d));
		DefaultSizeNodeFigureWithFixedAnchors2 result = new DefaultSizeNodeFigureWithFixedAnchors2(
				40, 40, anchorLocations);
		return result;

	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(
			org.eclipse.emf.common.notify.Notification notification) {
		super.handleNotificationEvent(notification);
		if (notification.getNotifier() instanceof Relationship) {
			if (notification.getFeature() instanceof EReference) {
				AutomaticCardinalityRelationship
						.AutomaticCardinalityRelationship2((Relationship) notification
								.getNotifier());
			}
		}
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(EntityRelationshipVisualIDRegistry
				.getType(RelationshipName_relationship2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class WeakExistenceRelationshipFigure extends ScalablePolygonShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureWeakExistenceRelationshipName_relationshipFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTitle;

		/**
		 * @generated
		 */
		public WeakExistenceRelationshipFigure() {
			this.setLayoutManager(new StackLayout());
			this.addPoint(new Point(getMapMode().DPtoLP(100), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(150), getMapMode()
					.DPtoLP(50)));
			this.addPoint(new Point(getMapMode().DPtoLP(50), getMapMode()
					.DPtoLP(50)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(100)));
			this.addPoint(new Point(getMapMode().DPtoLP(100), getMapMode()
					.DPtoLP(200)));
			this.addPoint(new Point(getMapMode().DPtoLP(200), getMapMode()
					.DPtoLP(100)));
			this.addPoint(new Point(getMapMode().DPtoLP(150), getMapMode()
					.DPtoLP(50)));
			this.addPoint(new Point(getMapMode().DPtoLP(50), getMapMode()
					.DPtoLP(50)));
			this.setFill(true);
			this.setForegroundColor(ColorConstants.black);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(109),
					getMapMode().DPtoLP(76)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureWeakExistenceRelationshipName_relationshipFigure = new WrappingLabel();

			fFigureWeakExistenceRelationshipName_relationshipFigure
					.setText("WERelationship");

			fFigureWeakExistenceRelationshipName_relationshipFigure
					.setAlignment(org.eclipse.draw2d.PositionConstants.CENTER);

			this.add(fFigureWeakExistenceRelationshipName_relationshipFigure);

			fFigureTitle = new WrappingLabel();

			fFigureTitle.setText("E");

			fFigureTitle.setAlignment(org.eclipse.draw2d.PositionConstants.TOP);

			this.add(fFigureTitle);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWeakExistenceRelationshipName_relationshipFigure() {
			return fFigureWeakExistenceRelationshipName_relationshipFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTitle() {
			return fFigureTitle;
		}

	}

}
