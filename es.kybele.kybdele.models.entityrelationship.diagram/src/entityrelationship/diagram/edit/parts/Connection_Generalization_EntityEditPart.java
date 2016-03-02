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

import entityrelationship.Connection_Generalization_Entity;
import entityrelationship.Entity;
import entityrelationship.diagram.edit.parts.custom.AutomaticCardinalityRelationship;
import entityrelationship.diagram.edit.policies.Connection_Generalization_EntityItemSemanticEditPolicy;

/**
 * @generated
 */
public class Connection_Generalization_EntityEditPart extends
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
	 * 
	 */
	public void setModel(Object model) {
		super.setModel(model);
		if (model instanceof EdgeImpl) {
			EdgeImpl ei = (EdgeImpl) model;

			Connection_Generalization_Entity cge = (Connection_Generalization_Entity) ei

			.getElement();
			View vtarget = ei.getTarget();

			if (!cge.getMaximum_cardinality().equals("1")) {
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
				if (vtarget.getElement() instanceof Entity) {
					f.setTargetDecoration(decoration);
				} else {
					f.setSourceDecoration(decoration);
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
				if (vtarget.getElement() instanceof Entity) {
					f.setTargetDecoration(decoration);
				} else {
					f.setSourceDecoration(decoration);
				}

				this.setFigure(f);

			}

		}

	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(
			org.eclipse.emf.common.notify.Notification notification) {
		super.handleNotificationEvent(notification);
		EdgeImpl ei = (EdgeImpl) this.getModel();

		Connection_Generalization_Entity cer = (Connection_Generalization_Entity) ei
				.getElement();
		View vtarget = ei.getTarget();

		if (notification.getNotifier() instanceof Connection_Generalization_Entity) {

			Connection_Generalization_Entity c = (Connection_Generalization_Entity) notification
					.getNotifier();


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
				if (vtarget.getElement() instanceof Entity) {
					f.setTargetDecoration(decoration);
				} else {
					f.setSourceDecoration(decoration);
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
				if (vtarget.getElement() instanceof Entity) {
					f.setTargetDecoration(decoration);
				} else {
					f.setSourceDecoration(decoration);
				}

			}

			AutomaticCardinalityRelationship
					.AutomaticCardinalityGeneralization((Connection_Generalization_Entity) notification
							.getNotifier());
		}

	}

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4019;

	/**
	 * @generated
	 */
	public Connection_Generalization_EntityEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Connection_Generalization_EntityItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Connection_Generalization_EntityMinimum_cardinalityMaxiEditPart) {
			((Connection_Generalization_EntityMinimum_cardinalityMaxiEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureConnection_Generalization_EntityCardinalityFigure());
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
		if (childEditPart instanceof Connection_Generalization_EntityMinimum_cardinalityMaxiEditPart) {
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
		return new Connection_Generalization_EntityFigure();
	}

	/**
	 * @generated
	 */
	public Connection_Generalization_EntityFigure getPrimaryShape() {
		return (Connection_Generalization_EntityFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class Connection_Generalization_EntityFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureConnection_Generalization_EntityCardinalityFigure;

		/**
		 * @generated
		 */
		public Connection_Generalization_EntityFigure() {
			this.setForegroundColor(ColorConstants.black);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureConnection_Generalization_EntityCardinalityFigure = new WrappingLabel();

			fFigureConnection_Generalization_EntityCardinalityFigure
					.setText("");

			this.add(fFigureConnection_Generalization_EntityCardinalityFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConnection_Generalization_EntityCardinalityFigure() {
			return fFigureConnection_Generalization_EntityCardinalityFigure;
		}

	}

}
