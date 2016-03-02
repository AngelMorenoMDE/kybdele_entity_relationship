package entityrelationship.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import entityrelationship.diagram.edit.policies.AttributeAttributes_compositesItemSemanticEditPolicy;

/**
 * @generated
 */
public class AttributeAttributes_compositesEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {
	/**
	 * @generated
	 */
	public void performRequest(Request request) {

		if (request.getType() == RequestConstants.REQ_OPEN) {
			try {
				PlatformUI.getWorkbench().getActiveWorkbenchWindow()
						.getActivePage()
						.showView("org.eclipse.ui.views.PropertySheet");
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
		super.performRequest(request);
	}

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4009;

	/**
	 * @generated
	 */
	public AttributeAttributes_compositesEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AttributeAttributes_compositesItemSemanticEditPolicy());
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
		return new AttributeAttributes_compositesTargetDecoration();
	}

	/**
	 * @generated
	 */
	public AttributeAttributes_compositesTargetDecoration getPrimaryShape() {
		return (AttributeAttributes_compositesTargetDecoration) getFigure();
	}

	/**
	 * @generated
	 */
	public class AttributeAttributes_compositesTargetDecoration extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		public AttributeAttributes_compositesTargetDecoration() {
			this.setForegroundColor(ColorConstants.black);

		}

	}

}
