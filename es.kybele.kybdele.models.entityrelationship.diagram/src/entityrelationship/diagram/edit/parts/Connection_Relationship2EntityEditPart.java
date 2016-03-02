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

import entityrelationship.Connection_Relationship2Entity;
import entityrelationship.Relationship;
import entityrelationship.diagram.edit.parts.custom.AutomaticCardinalityRelationship;
import entityrelationship.diagram.edit.policies.Connection_Relationship2EntityItemSemanticEditPolicy;

/**
 * @generated
 */
public class Connection_Relationship2EntityEditPart extends
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
	public static final int VISUAL_ID = 4021;

	/**
	 * @generated
	 */
	public Connection_Relationship2EntityEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Connection_Relationship2EntityItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Connection_Relationship2EntityRoleEditPart) {
			((Connection_Relationship2EntityRoleEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureConnection_Relationship2EntityRoleFigure());
			return true;
		}
		if (childEditPart instanceof Connection_Relationship2EntityMinimum_cardinalityMaxiEditPart) {
			((Connection_Relationship2EntityMinimum_cardinalityMaxiEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureConnection_Relationship2EntityCardinalityFigure());
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
		if (childEditPart instanceof Connection_Relationship2EntityRoleEditPart) {
			return true;
		}
		if (childEditPart instanceof Connection_Relationship2EntityMinimum_cardinalityMaxiEditPart) {
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
		return new Connection_Relationship2EntityFigure();
	}

	/**
	 * @generated
	 */
	public Connection_Relationship2EntityFigure getPrimaryShape() {
		return (Connection_Relationship2EntityFigure) getFigure();
	}

	/**
	 * @generated
	 * 
	 */
	public void setModel(Object model) {
		super.setModel(model);
		if (model instanceof EdgeImpl) {
			EdgeImpl ei = (EdgeImpl) model;

			Connection_Relationship2Entity cer = (Connection_Relationship2Entity) ei
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

		Connection_Relationship2Entity cer = (Connection_Relationship2Entity) ei
				.getElement();
		View vtarget = ei.getTarget();

		if (notification.getNotifier() instanceof Connection_Relationship2Entity) {

			Connection_Relationship2Entity c = (Connection_Relationship2Entity) notification
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
					.AutomaticCardinalityRelationship((Connection_Relationship2Entity) notification
							.getNotifier());

		}

		super.handleNotificationEvent(notification);

	}

	/**
	 * @generated
	 */
	public class Connection_Relationship2EntityFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureConnection_Relationship2EntityRoleFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureConnection_Relationship2EntityCardinalityFigure;

		/**
		 * @generated
		 */
		public Connection_Relationship2EntityFigure() {
			this.setForegroundColor(ColorConstants.black);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureConnection_Relationship2EntityRoleFigure = new WrappingLabel();

			fFigureConnection_Relationship2EntityRoleFigure.setText("");

			this.add(fFigureConnection_Relationship2EntityRoleFigure);

			fFigureConnection_Relationship2EntityCardinalityFigure = new WrappingLabel();

			fFigureConnection_Relationship2EntityCardinalityFigure.setText("");

			this.add(fFigureConnection_Relationship2EntityCardinalityFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConnection_Relationship2EntityRoleFigure() {
			return fFigureConnection_Relationship2EntityRoleFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConnection_Relationship2EntityCardinalityFigure() {
			return fFigureConnection_Relationship2EntityCardinalityFigure;
		}

	}

}
