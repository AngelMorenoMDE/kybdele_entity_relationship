package entityrelationship.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.EdgeImpl;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import entityrelationship.Connection_Entity2Relationship;
import entityrelationship.Relationship;
import entityrelationship.diagram.edit.parts.custom.AutomaticCardinalityRelationship;
import entityrelationship.diagram.edit.policies.Connection_Entity2RelationshipItemSemanticEditPolicy;

/**
 * @generated
 */
public class Connection_Entity2RelationshipEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {
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
	public static final int VISUAL_ID = 4020;

	/**
	 * @generated
	 */
	public Connection_Entity2RelationshipEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Connection_Entity2RelationshipItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Connection_Entity2RelationshipRoleEditPart) {
			((Connection_Entity2RelationshipRoleEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureConnection_Entity2RelationshipRoleFigure());
			return true;
		}
		if (childEditPart instanceof Connection_Entity2RelationshipMinimum_cardinalityMaxiEditPart) {
			((Connection_Entity2RelationshipMinimum_cardinalityMaxiEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureConnection_Entity2RelationshipCardinalityFigure());
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
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Connection_Entity2RelationshipRoleEditPart) {
			return true;
		}
		if (childEditPart instanceof Connection_Entity2RelationshipMinimum_cardinalityMaxiEditPart) {
			return true;
		}
		return false;
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
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new Connection_Entity2RelationshipFigure();
	}

	/**
	 * @generated
	 */
	public Connection_Entity2RelationshipFigure getPrimaryShape() {
		return (Connection_Entity2RelationshipFigure) getFigure();
	}

	/**
	 * @generated
	 * 
	 */
	public void setModel(Object model) {
		super.setModel(model);
		if (model instanceof EdgeImpl) {
			EdgeImpl ei = (EdgeImpl) model;

			Connection_Entity2Relationship cer = (Connection_Entity2Relationship) ei
					.getElement();
			View vtarget = ei.getTarget();

			if (!cer.getMaximum_cardinality().equals("1")) {
				PolylineConnectionEx f = (PolylineConnectionEx) this
						.getFigure();
				PolygonDecoration decoration = new PolygonDecoration();
				PointList decorationPointList = new PointList();
				decorationPointList.addPoint(0, 0);
				decorationPointList.addPoint(-1, 1);
				decorationPointList.addPoint(-1, 0);
				decorationPointList.addPoint(-1, -1);
				decoration.setTemplate(decorationPointList);
				decoration.setFill(true);
				if (vtarget.getElement() instanceof Relationship) {
					f.setSourceDecoration(decoration);
				} else {
					f.setTargetDecoration(decoration);
				}

				this.setFigure(f);
			} else {
				PolylineConnectionEx f = (PolylineConnectionEx) this
						.getFigure();
				PolygonDecoration decoration = new PolygonDecoration();
				PointList decorationPointList = new PointList();
				decorationPointList.addPoint(0, 0);
				decoration.setTemplate(decorationPointList);
				decoration.setFill(false);
				f.setTargetDecoration(decoration);

				this.setFigure(f);

			}

		}

	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(
			org.eclipse.emf.common.notify.Notification notification) {

		EdgeImpl ei = (EdgeImpl) this.getModel();

		Connection_Entity2Relationship cer = (Connection_Entity2Relationship) ei
				.getElement();
		View vtarget = ei.getTarget();

		if (notification.getNotifier() instanceof Connection_Entity2Relationship) {

			Connection_Entity2Relationship c = (Connection_Entity2Relationship) notification
					.getNotifier();

			c.setMaximum_cardinality(c.getMaximum_cardinality());
			c.setMinimum_cardinality(c.getMinimum_cardinality());
			this.getFigure().repaint();

			if (!c.getMaximum_cardinality().equals("1")) {
				PolylineConnectionEx f = (PolylineConnectionEx) this
						.getFigure();
				PolygonDecoration decoration = new PolygonDecoration();
				PointList decorationPointList = new PointList();
				decorationPointList.addPoint(0, 0);
				decorationPointList.addPoint(-1, 1);
				decorationPointList.addPoint(-1, 0);
				decorationPointList.addPoint(-1, -1);
				decoration.setTemplate(decorationPointList);
				decoration.setFill(true);
				if (vtarget.getElement() instanceof Relationship) {
					f.setSourceDecoration(decoration);
				} else {
					f.setTargetDecoration(decoration);
				}

				this.setFigure(f);
			} else {
				PolylineConnectionEx f = (PolylineConnectionEx) this
						.getFigure();
				PolygonDecoration decoration = new PolygonDecoration();
				PointList decorationPointList = new PointList();
				decorationPointList.addPoint(0, 0);
				decoration.setTemplate(decorationPointList);
				decoration.setFill(false);
				if (vtarget.getElement() instanceof Relationship) {
					f.setSourceDecoration(decoration);
				} else {
					f.setTargetDecoration(decoration);
				}

			}
			AutomaticCardinalityRelationship
					.AutomaticCardinalityRelationship((Connection_Entity2Relationship) notification
							.getNotifier());

		}

		super.handleNotificationEvent(notification);

	}

	/**
	 * @generated
	 */
	public class Connection_Entity2RelationshipFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureConnection_Entity2RelationshipRoleFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureConnection_Entity2RelationshipCardinalityFigure;

		/**
		 * @generated
		 */
		public Connection_Entity2RelationshipFigure() {
			this.setForegroundColor(ColorConstants.black);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureConnection_Entity2RelationshipRoleFigure = new WrappingLabel();

			fFigureConnection_Entity2RelationshipRoleFigure.setText("");

			this.add(fFigureConnection_Entity2RelationshipRoleFigure);

			fFigureConnection_Entity2RelationshipCardinalityFigure = new WrappingLabel();

			fFigureConnection_Entity2RelationshipCardinalityFigure.setText("");

			this.add(fFigureConnection_Entity2RelationshipCardinalityFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConnection_Entity2RelationshipRoleFigure() {
			return fFigureConnection_Entity2RelationshipRoleFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConnection_Entity2RelationshipCardinalityFigure() {
			return fFigureConnection_Entity2RelationshipCardinalityFigure;
		}

	}

}
