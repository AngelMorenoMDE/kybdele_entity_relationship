package entityrelationship.diagram.edit.parts.custom;


import entityrelationship.Connection_Entity2Relationship;
import entityrelationship.Connection_Generalization_Entity;
import entityrelationship.Connection_Relationship2Entity;
import entityrelationship.Relationship;


public class AutomaticCardinalityRelationship{

	public static void AutomaticCardinalityRelationship(Connection_Entity2Relationship notifier) {
		notifier.getTarget_relationship().getRelationship_connected_to_entity2relationship();
		notifier.getTarget_relationship().getRelationship_connected_to_relationship2entity();
		String card =notifier.getTarget_relationship().getCardinality();
		notifier.getTarget_relationship().setCardinality("");

		notifier.getTarget_relationship().setCardinality(card);
	}
	public static void AutomaticCardinalityRelationship(Connection_Relationship2Entity notifier) {
		notifier.getSource_relationship().getRelationship_connected_to_entity2relationship();
		notifier.getSource_relationship().getRelationship_connected_to_relationship2entity();
		String card =notifier.getSource_relationship().getCardinality();
		notifier.getSource_relationship().setCardinality("");

		notifier.getSource_relationship().setCardinality(card);
	}
	public static void AutomaticCardinalityGeneralization(Connection_Generalization_Entity notifier) {
		
		//String s = notifier.getMaximum_cardinality();
		
		//notifier.setMaximum_cardinality("");
		//notifier.setMaximum_cardinality(s);

	}
	
	public static void AutomaticCardinalityRelationship2(Relationship notifier) {
		notifier.getRelationship_connected_to_entity2relationship();
		notifier.getRelationship_connected_to_relationship2entity();
		String card =notifier.getCardinality();
		notifier.setCardinality("");
		notifier.setCardinality(card);
	}
}
