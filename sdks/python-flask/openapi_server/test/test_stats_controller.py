# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.inline_response20011 import InlineResponse20011  # noqa: E501
from openapi_server.models.inline_response20012 import InlineResponse20012  # noqa: E501
from openapi_server.models.inline_response20013 import InlineResponse20013  # noqa: E501
from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server.test import BaseTestCase


class TestStatsController(BaseTestCase):
    """StatsController integration test stubs"""

    def test_engines_status(self):
        """Test case for engines_status

        Engines Status
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
        }
        response = self.client.open(
            '/stat/engines',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_nodes_status(self):
        """Test case for nodes_status

        Nodes Status
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
        }
        response = self.client.open(
            '/stat/nodes',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_product_version(self):
        """Test case for product_version

        Get Product Version
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
        }
        response = self.client.open(
            '/version',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
